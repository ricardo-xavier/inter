package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador551")
public class Somador551 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
