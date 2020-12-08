package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1913")
public class Somador1913 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
