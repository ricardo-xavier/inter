package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1362")
public class Somador1362 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
