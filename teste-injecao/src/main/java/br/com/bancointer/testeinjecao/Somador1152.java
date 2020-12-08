package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1152")
public class Somador1152 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
