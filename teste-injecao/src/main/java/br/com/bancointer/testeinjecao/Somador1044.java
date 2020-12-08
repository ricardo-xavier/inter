package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1044")
public class Somador1044 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
